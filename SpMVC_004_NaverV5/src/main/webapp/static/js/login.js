document.addEventListener("DOMContentLoaded", () => {
  const login_form = document.querySelector("form.login");
  const username = login_form?.querySelector("input[name='username']");
<<<<<<< HEAD

  const password = login_form?.querySelector("input[name='password'");
=======
  const password = login_form?.querySelector("input[name='password']");
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
  const btn_login = login_form?.querySelector("button.btn-login");

  btn_login?.addEventListener("click", () => {
    if (username.value === "") {
<<<<<<< HEAD
      alert("아이디를 입력해주세요");
=======
      alert("USER NAME 을 먼저 입력하세요");
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
      username.focus();
      return false;
    }
    if (password.value === "") {
<<<<<<< HEAD
      alert("비밀번호를 입력해주세요");
=======
      alert("비밀번호를 먼저 입력하세요");
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
      password.focus();
      return false;
    }
    login_form.submit();
  });
});
