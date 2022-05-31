document.addEventListener("DOMContentLoaded", () => {
  const id_check = document.querySelector("button.id-check");
  const join_btn = document.querySelector("button.join");
  const join_form = document.querySelector("form.join");

  const index = {
    username: 0,
    password: 1,
    re_password: 2,
    name: 3,
    email: 4,
  };

  const input_list = document.querySelectorAll("form.join input");
  const username = input_list[index.username];
  const password = input_list[index.password];
  const re_password = input_list[index.re_password];
  const name = input_list[index.name];
  const email = input_list[index.email];

  const username_msg = document.querySelector("div.username");

  const username_isBlank = () => {
    username_msg.innerText = " * USERNAME을 입력해주세요.";
    username_msg.classList.remove("ok");
    username_msg.classList.add("warn");
    username.focus();
    return false;
  };

  if (join_btn) {
    join_btn.addEventListener("click", () => {
      if (username.value === "") {
        username_isBlank();
        return false;
      }
      if (password.value === "") {
        alert("비밀번호를 입력해주세요.");
        password.focus();
        return false;
      }
      if (re_password.value === "") {
        alert("비밀번호 확인은 입력해주세요.");
        re_password.focus();
        return false;
      }
      if (password.value !== re_password.value) {
        alert("비밀번호가 일치하지 않습니다.");
        password.value = "";
        re_password.value = "";
        password.focus();
        return false;
      }

      join_form.submit();
    });
  }

  if (id_check) {
    id_check.addEventListener("click", () => {
      if (username.value === "") {
        username_isBlank();
        return false;
      } // end if

      fetch(`${rootPath}/user/idcheck/${username.value}`)
        .then((res) => {
          return res.text();
        })
        .then((result) => {
          console.log(result);
          if (result === "ok") {
            username_msg.classList.remove("warn");
            username_msg.classList.add("ok");
            username_msg.innerText = "* 사용할 수 있는 USERNAME입니다.";
          } else {
            username_msg.classList.remove("ok");
            username_msg.classList.add("warn");
            username_msg.innerText = "* 이미 가입된 USERNAME입니다.";
            username.focus();
          }
        });
    });
  }
});
