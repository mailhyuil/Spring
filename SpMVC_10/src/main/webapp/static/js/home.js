document.addEventListener("DOMContentLoaded", () => {
  const main_nav = document.querySelector("nav.main_nav");

  if (main_nav) {
    main_nav.addEventListener("click", (e) => {
      const li = e.target;

      if (li.tagName === "LI") {
        const text = li.innerText;

        let url = `${rootPath}`;

        if (text === "로그인") {
          url += "/user/login";
        } else if (text === "회원가입") {
          url += "/user/join";
        } else if (text === "로그아웃") {
          url += "/user/logout";
        }

        document.location.href = url;
      }
    });
  }
});
