document.addEventListener("DOMContentLoaded", () => {
  const table = document.querySelector("table");

  // for (let i = 0; i < tds.length; i++) {
  //   tds[i].addEventListener("click", () => {
  //     alert(tds[i].textContent);
  //   });
  // }

  /*
    이 스크립트가 실행되는 DOM 화면에 table tag가 있으면
    */
  if (table) {
    table.addEventListener("click", (e) => {
      const target = e.target;
      const text = target.innerText;
      const cName = target.className;
      const stNum = target.dataset.stNum;
      if (cName === "name") {
        document.location.href = "student/detail?stNum=" + stNum;
      }
    });
  }
});
