const memo = document.querySelector(".memo");

memo.addEventListener("click", (e) => {
  const target = e.target.closest(".memo_content");
  location.href = `${rootPath}/detail/${target.dataset.id}`;
});
