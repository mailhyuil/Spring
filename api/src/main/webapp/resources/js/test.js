const txt = document.querySelector("h1");


txt.addEventListener("click", (e) => {
    console.log(e.target.textContent);

    const json = e.target.textContent;

    fetch(`http://localhost:8080/api/test`, {
        method: 'POST',
        headers: {
            'Content-Type': 'text/plain'
        },
        body: json
    });

    return;
})

