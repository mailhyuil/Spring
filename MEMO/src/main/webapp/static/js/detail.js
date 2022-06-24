const memo = document.querySelector(".memo");

memo.addEventListener("click", (e) => {
  const target = e.target;
  console.log(target.dataset.id);
  location.href = `${rootPath}/detail?id=${target.dataset.id}`;
  //fetch(`${rootPath}/detail?id=${target.dataset.id}`);
});
