document.addEventListener("DOMContentLoaded", () => {
<<<<<<< HEAD
  const username = document.querySelector("#username");
  const password = document.querySelector("#password");
  const re_password = document.querySelector("#re_password");
  const email = document.querySelector("#email");
  const btn_join = document.querySelector("#btn-join");

  const div_index = {
    username: 0,
    password: 1,
    re_password: 2,
    email: 3,
    name: 4,
    nickname: 5,
  };
  /**
   * input box에서 focus가 벗어났을때 발생하는 event
   * focusout, blur
   * focusout은 이벤트 버블링이 심하게 발생한다.
   * JS 코드에서는 주로 blur를 사용한다
   */

  username?.focus();

  const error_divs = document.querySelectorAll("div.error");

  const passRule = /^[A-Za-z0-9]{6,12}$/;
  // password.value 의 값이 패턴에 일치하지 않으면
  const passRule2 =
    /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
  // 숫자와 문자를 포함하는 6자리 ~ 12자리의 문자열 검사패턴

  const emailRule =
    /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

  const error_msg = (div, message) => {
    div.classList.remove("w3-text-blue");
    div.classList.add("w3-text-red");
    div.innerText = message;
  };

  const ok_msg = (div, message) => {
    div.classList.remove("w3-text-red");
    div.classList.add("w3-text-blue");
    div.innerText = message;
  };

  username?.addEventListener("blur", (e) => {
    const current = e.currentTarget;
    const username_div = error_divs[div_index.username];

    if (current.value === "") {
      username_div.innerText = "* USERNAME은 반드시 입력하세요";
      username_div.classList.remove("w3-text-blue");
      username_div.classList.add("w3-text-red");
      current.focus();
      return false;
    }
    fetch(`${rootPath}/user/idcheck/${current.value}`)
      .then((res) => res.text())
      .then((result) => {
        if (result === "OK") {
          username_div.classList.remove("w3-text-red");
          username_div.classList.add("w3-text-blue");
          username_div.innerText = "* 사용 가능한 아이디입니다";
          console.log("1");
        } else {
          username_div.classList.remove("w3-text-blue");
          username_div.classList.add("w3-text-red");
          username_div.innerText = "* 이미 가입된 아이디입니다";
          username.focus();
        }
        console.log("2");
      });
  }); // end username event

  password?.addEventListener("input", (e) => {
    const current = e.currentTarget;
    const error = error_divs[div_index.password];
    if (!passRule2.test(current.value)) {
      error.classList.remove("w3-text-blue");
      error.classList.add("w3-text-red");
      error.innerText =
        "* 비밀번호가 규칙에 맞지 않습니다 (특수, 영문, 숫자 포함 8 ~ 15";
    } else {
      error.classList.remove("w3-text-red");
      error.classList.add("w3-text-blue");
      error.innerText = "사용할 수 있는 비밀번호입니다.";
    }
  });

  re_password?.addEventListener("input", (e) => {
    const current = e.currentTarget;
    const error = error_divs[div_index.re_password];

    if (current.value === password?.value) {
      error.classList.remove("w3-text-red");
      error.classList.add("w3-text-blue");
      error.innerText = "확인되었습니다.";
    } else {
      error.classList.remove("w3-text-blue");
      error.classList.add("w3-text-red");
      error.innerText = "비밀번호가 틀립니다.";
    }
  });

  email?.addEventListener("input", (e) => {
    const current = e.currentTarget;
    const error = error_divs[div_index.email];
    if (emailRule.test(current.value)) {
      error.classList.remove("w3-text-red");
      error.classList.add("w3-text-blue");
      error.innerText = "* email 양식 검사 완료";
    } else {
      error.classList.remove("w3-text-blue");
      error.classList.add("w3-text-red");
      error.innerText = "* email 양식을 확인해주세요";
      return false;
    }

    fetch(`${rootPath}/user/emailcheck?email=${current.value}`)
      .then((res) => res.text())
      .then((result) => {
        if (result === "OK") {
          error.classList.remove("w3-text-red");
          error.classList.add("w3-text-blue");
          error.innerText = "사용할 수 있는 이메일입니다.";
        } else {
          error.classList.remove("w3-text-blue");
          error.classList.add("w3-text-red");
          error.innerText = "이미 가입된 이메일입니다.";
        }
      });
  });

  btn_join?.addEventListener("click", () => {
    if (username.value === "") {
      alert("아이디를 입력해주세요");
      username.focus();
      return false;
    }
    if (username.value.length > 20) {
      alert("아이디는 20자 이내로 입력해주세요");
=======



  const btn_join = document.querySelector("#btn-join");


  btn_join?.addEventListener("click", async () => {

    const username = document.querySelector("#username");
    const password = document.querySelector("#password");
    const re_password = document.querySelector("#re_password");
    const email = document.querySelector("#email");
    const name = document.querySelector("#name");
    const nickname = document.querySelector("#nickname");


    if (username.value === "") {
      alert("USER NAME 은 반드시 입력하세요");
      username.focus();
      return false;
    }

    if (username.value.length > 20) {
      alert("USER NAME 은 20자 이내로 입력하세요");
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
      username.focus();
      return false;
    }

    if (username.value.toUpperCase() === password.value.toUpperCase()) {
<<<<<<< HEAD
      alert("아이디와 비밀번호는 같을 수 없습니다");
=======
      alert("USER NAME 과 비밀번호는 같을수 없습니다");
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
      password.focus();
      return false;
    }

<<<<<<< HEAD
    if (passRule2.test(password.value) === false) {
      alert("비밀번호는 문자, 숫자 포함 6-12자리 까지 입력하세요");
      password.focus();
      return;
    }

    if (re_password.value === "") {
      alert("비밀번호 확인을 입력해주세요");
=======
    // 문자, 숫자, 특수문자가 포함된 8자리 ~ 15자리까지 문자열 검사패턴
    const passRule2 =
      /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;

    // 숫자와 문자를 포함하는 6자리 ~ 12자리의 문자열 검사패턴
    const passRule = /^[A-Za-z0-9]{6,12}$/;

    // password.value 의 값이 패턴에 일치하지 않으면
    if (passRule2.test(password.value) === false) {
      alert(
        "비밀번호는 특수문자, 영문자, 숫자 포함 \n8자리 ~ 15자리 까지 입력하세요"
      );
      password.focus();
      return false;
    }

    if (re_password.value === "") {
      alert("비밀번호 확인을 입력해 주세요");
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
      re_password.focus();
      return false;
    }

    if (password.value !== re_password.value) {
      alert("비밀번호 확인 값이 일치하지 않습니다");
      password.value = "";
      re_password.value = "";
      password.focus();
      return false;
    }

<<<<<<< HEAD
=======
    const emailRule =
      /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;


    /*     fetch(`${rootpath}/user/email_check?email=${email.value}`)
          .then(res => res.text())
          .then(result => {
            if (result === "USED") {
              alert("이미 등록된 이메일입니다.");
              email.focus();
              return false;
            }
          }) */
    const res = await fetch(`${rootPath}/user/email_check?email=${email.value}`);
    const result = await res.text();
    console.log(result);

    if (result === "USED") {
      alert("이미 등록된 이메일입니다.");
      email.focus();
      return false;
    }

>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
    if (!emailRule.test(email.value)) {
      alert("이메일 형식이 잘못되었습니다 다시 입력해주세요");
      email.focus();
      return false;
    }

    document.querySelector("form.join")?.submit();
  });
<<<<<<< HEAD
=======


>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
});
