const std_num_check_cb = () => {
    const st_num = document.querySelector("input[name='st_num']");
    if (st_num.value === "") {
        alert("중복검사를 하려면 학번을 먼저 입력하세요");
        st_num.focus();
        return false;
    }

    //alert("입력한 학번" + st_num.value);
    if (!st_num_fetch(st_num.value)) {
        st_num.focus();
        return false;
    }
};

document.addEventListener("DOMContentLoaded", () => {

    const std_num_check = document.querySelector("button.std-num-check");

    if (std_num_check) {
        std_num_check.addEventListener("click", std_num_check_cb);
    }
    // 현재 html화면에 있는 클래스가 std-save인 버튼을 챙겨서
    // 핸들링할 준비를 해달라.
    const std_save = document.querySelector("button.std-save");

    if (std_save) {
        std_save.addEventListener("click", save_cb)
    }



})