const st_num_fetch = (st_num) => {
    // XMLHttpRequest open, send, onload event + promise 반환까지 해줌
    fetch(`${rootPath}/student/st_num_check?st_num=${st_num}`)
        .then(res => res.text())
        .then(result => {
            if (result === "USE") {
                alert("이미 등록된 학번입니다\n 다시 입력하세요")
                return false;
            } else {
                alert("사용 가능한 학번입니다.")
                return true;
            }
        });
}

const st_num_fetchV2 = async (st_num) => {
    const res = await fetch(`${rootPath}/student/st_num_check?st_num=${st_num}`)
    const result = await res.text();

    if (result === "USE") {
        return false;
    } else {
        return true;
    }

}


const save_cb = async () => {

    const st_num = document.querySelector("input[name='st_num']")
    const st_name = document.querySelector("input[name='st_name']")
    const st_dept = document.querySelector("input[name='st_dept']")
    const st_grade = document.querySelector("input[name='st_grade']")
    const st_addr = document.querySelector("input[name='st_addr']")
    const st_tel = document.querySelector("input[name='st_tel']")


    // js 코드를 사용하여 client size validation

    if (st_num.value === "") {
        st_num.focus();

        alert("학번은 반드시 입력해야 합니다.");
        return false;
    }

    const st_num_yes = await st_num_fetchV2(st_num.value);

    console.log(st_num_yes);

    if (!st_num_yes) {
        alert("이미 등록된 학번입니다\n다시 확인하세요");
        st_num.focus();
        return false;
    }


    if (st_name.value === "") {
        st_name.focus();
        alert("이름은 반드시 입력해야 합니다.");
        return false;
    }

    if (st_dept.value === "") {
        st_dept.focus();
        alert("학과는 반드시 입력해야 합니다.")
        return false;
    }

    if (st_grade.value === "") {
        st_grade.focus();
        alert("학년은 반드시 입력해야 합니다.");
        return false;
    }

    const num_grade = Number(st_grade.value);

    if (!num_grade) { // NaN이면?
        alert("학년은 숫자로만 입력하세요.");
        st_grade.value = "";
        num_grade.focus();
        return false;
    }

    if (num_grade < 1 || num_grade > 4) {
        num_grade.focus();
        alert("학년은 1-4 범위내에서 입력하세요.")
        return false;
    }

    if (st_tel.value === "") {
        st_tel.focus();
        alert("전화번호를 입력해주세요.");
        return false;
    }

    if (st_addr.value === "") {
        st_addr.focus();
        alert("주소를 입력해주세요.")
        return false;
    }

    const form = document.querySelector("form");
    form.submit();
}