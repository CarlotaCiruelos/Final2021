
function getT(){
    fetch(`http://localhost:8080/api/v1/media`)
        .then(response => response.json())
        .then(data => {
            console.log(data)
            document.getElementById("sol").innerHTML = data;
        })

        .catch(e => {
            console.error("Error " + e)
        })

}