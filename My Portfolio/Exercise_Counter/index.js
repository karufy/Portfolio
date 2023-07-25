
let saveEl = document.getElementById("save-el")
let repsEl = document.getElementById("reps-el")
let count = 0;

function reps(){
    count++
    repsEl.textContent = count
}
function save(){
let newCount = count + " - "
saveEl.textContent += newCount;
repsEl.textContent = 0
count = 0
    
}

