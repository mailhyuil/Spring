<<<<<<< HEAD
const std_num_check_cb = () => {
  const st_num = document.querySelector("input[name='st_num']");
  if (st_num.value === "") {
    alert("중복검사를 하려면 학번을 먼저 입력하세요");
    st_num.focus();
    return false;
  }
  // alert("입력한 학번 : " + st_num.value);
  if (!st_num_fetch(st_num.value)) {
    st_num.focus();
  }
};

document.addEventListener("DOMContentLoaded", () => {
  const std_num_check = document.querySelector("button.std-num-check");

  /*
  std_num_check click event handler 를
  std_num_check_cb 이라는 함수로 별도 선언하고
  handler 에는 함수 이름을 매개변수로 전달하였다
  이때 함수이름에는 절대 () 를 붙이지 않다
  */
  if (std_num_check) {
    std_num_check.addEventListener("click", std_num_check_cb); // end callback
  }

  // 현재 html 화면에 있는 클래스가 std-save 인 버튼을 챙겨서
  // 핸들링할 준비를 해달라
  const std_save = document.querySelector("button.std-save");
  // std_save 가 정상적으로 준비되었느냐
  if (std_save) {
    std_save.addEventListener("click", save_cb);
  }
});
=======
document.addEventListener("DOMContentLoaded", () => {



    const std_num_check = document.querySelector("button.std-num-check");

    if(std_num_check){
        std_num_check.addEventListener("click",()=>{
            const st_num = document.querySelector("input[name='st_num']");
            if(st_num.value === ""){
                alert("중복검사를 하려면 학번을 먼저 입력하세요");
                st_num.focus();
                return false;
            }
            //alert("입력한 학번" + st_num.value);
            fetch(`${rootPath}/student/st_num_check?st_num=${st_num.value}`)
            .then(res=>res.text())
            .then(result=>{
                alert(result);
            });
        });
    }
    // 현재 html화면에 있는 클래스가 std-save인 버튼을 챙겨서
    // 핸들링할 준비를 해달라.
    const std_save = document.querySelector("button.std-save");

    if (std_save) {
        std_save.addEventListener("click", () => {
            const st_num = document.querySelector("input[name='st_num']")
            const st_name = document.querySelector("input[name='st_name']")
            const st_dept = document.querySelector("input[name='st_dept']")
            const st_grade = document.querySelector("input[name='st_grade']")
            const st_addr = document.querySelector("input[name='st_addr']")
            const st_tel = document.querySelector("input[name='st_tel']")


            // js 코드를 사용하여 client size validation

            if(st_num.value === ""){
                st_num.focus();

                alert("학번은 반드시 입력해야 합니다.");
                return false;
            }

            if(st_name.value === ""){
                st_name.focus();
                alert("이름은 반드시 입력해야 합니다.");
                return false;
            } 

            if(st_dept.value === ""){
                st_dept.focus();
                alert("학과는 반드시 입력해야 합니다.")
                return false;
            }

            if(st_grade.value === ""){
                st_grade.focus();
                alert("학년은 반드시 입력해야 합니다.");
                return false;
            }

            const num_grade = Number(st_grade.value);
            
            if(!num_grade){ // NaN이면?
                alert("학년은 숫자로만 입력하세요.");
                st_grade.value = "";
                num_grade.focus();
                return false;
            }

            if(num_grade < 1 || num_grade > 4){
                num_grade.focus();
                alert("학년은 1-4 범위내에서 입력하세요.")
                return false;
            }
            
            if(st_tel.value === ""){
                st_tel.focus();
                alert("전화번호를 입력해주세요.");
                return false;
            }

            if(st_addr.value === ""){
                st_addr.focus();
                alert("주소를 입력해주세요.")
                return false;
            }

            const form = document.querySelector("form");
            form.submit();
        })
    }



})
>>>>>>> ae373ae3259e4071ff920c5231ee0ea91045b5e1
