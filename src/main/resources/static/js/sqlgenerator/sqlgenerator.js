
class SqlGenerator {
	constructor() {
		this.query = document.querySelector(".gh-query-area");
		this.parameter = document.querySelector(".gh-parameter-area");
		this.result = document.querySelector(".gh-result-area");
	}

	render() {
		console.log("render page")
	}

	init() {
		console.log("start init")

		document.querySelector(".gh-generate-btn").addEventListener("click", () => {
			let completedQuery = this.query.value;
			this.parameter.value.split(",").forEach(value => {
				completedQuery = completedQuery.replace("?", value);
			});
			this.result.value = completedQuery;
		});
	}
}

const sqlGenerator = new SqlGenerator();

document.addEventListener("DOMContentLoaded", () => {
	sqlGenerator.init();
});