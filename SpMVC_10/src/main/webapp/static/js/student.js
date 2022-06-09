document.addEventListener("DOMContentLoaded", () => {
  const stnum_input = document.querySelector("input[name='st_num']");
  const std_table = document.querySelector("table.st-list");

  const index = {
    name: 0,
    grade: 1,
    tel: 2,
    addr: 3,
  };

  const student_get = async (stnum_value) => {
    const get_url = `${rootPath}/student/${stnum_value}/getter`;

    const res = await fetch(get_url);
    const studentVO = await res.json();

    const studentInfo = document.querySelectorAll("div.std span");

    studentInfo[index.name].innerText = studentVO.st_name;
    studentInfo[index.grade].innerText = studentVO.st_grade;
    studentInfo[index.tel].innerText = studentVO.st_tel;
    studentInfo[index.addr].innerText = studentVO.st_addr;

    if (stnum_input) {
      stnum_input.value = studentVO.st_num;
    }
  };

  if (stnum_input) {
    stnum_input.addEventListener("keypress", async (e) => {
      if (e.keyCode === 13) {
        // alert(e.target.value);
        const stnum_value = e.target.value;
        student_get(stnum_value);
      }
    });
  } // end if stnum_input

  if (std_table) {
    std_table.addEventListener("click", (e) => {
      const td = e.target;
      // click된 요소가 td이면
      if (td.tagName === "TD") {
        // 나의(TD) 부모 요소인 TR을 가져와라
        const parent_tr = td.closest("TR");

        const stnum_value = parent_tr.dataset.stnum;

        console.log(stnum_value);
        student_get(stnum_value);
      }
    });
  }
});
