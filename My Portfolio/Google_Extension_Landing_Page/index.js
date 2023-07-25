// DOM elements
const time = document.getElementById("time");
      greeting = document.getElementById("greeting");
      userName = document.getElementById("username");
      focus = document.getElementById("focus");
const  showAmPM = true 

    // Show Time
      function showTime() {
        let today = new Date();
        hrs = today.getHours();
        mins = today.getMinutes();
        secs = today.getSeconds();

        //   Set AM or PM
        const amPm = hrs >= 12 ? "AM" : "PM";

        // 12hr format
        hrs = hrs % 12 || 12;

        // Output Time
        time.innerHTML = `${hrs}<span>:</span>${addZero(mins)}<span>:</span>${addZero(secs)} ${showAmPM ? amPm : ''}`;

        setTimeout(showTime, 1000);
      }

    //   Add zeros to secs space
    function addZero(n) {
        return(parseInt(n, 10) < 10 ? "0" : "") + n;
    }

    // Set background $ greeting
    function setBGnGreet (){
        let today = new Date();
        hrs = today.getHours();

        if (hrs < 12){
        document.body.style.backgroundImage = "url('pexels-kate-trifo-3851209.jpg')";
        document.body.style.backgroundSize = "1700px 1000px";
        greeting.textContent="Good Morning!";
        }
        else if(hrs < 18){
            document.body.style.backgroundImage = "url('pexels-juan-salamanca-61135.jpg')";
            document.body.style.backgroundSize = "1700px 1000px";
            greeting.textContent="Good Afternoon!";
        }else {
            document.body.style.backgroundImage = "url('pexels-poppy-martinez-17035125.jpg')";
            document.body.style.backgroundSize = "1700px 1000px";
            greeting.textContent="Good Evening!";
            document.body.style.color = "white";
        }
    }

    // Getters and setters
    function getUserName(){
        if (localStorage.getItem('username')===null){
            userName.textContent = '[Enter Name]';
        }
        else {
            userName.textContent= localStorage.getItem('username');
        }
    }

    function setName(e){
        if(e.type === 'keypress'){
            if(e.which == 13 || e.keyCode == 13){
                localStorage.setItem('userName', e.target.innerText);
                userName.blur();
            }
        }
        else{
            localStorage.setItem('userName', e.target.innerText);
        }
    }

    function getFocus(){
        if (localStorage.getItem('focus')===null){
            focus.textContent = '[Ask Google Anything!!!]';
        }
        else {
            focus.textContent= localStorage.getItem('focus');
        }
    }

    function setFocus(e){
        if(e.type === 'keypress'){
            if(e.which == 13 || e.keyCode == 13){
                localStorage.setItem('focus', e.target.innerText);
                focus.blur();
            }
        }
        else{
            localStorage.setItem('focus', e.target.innerText);
        }
    }

    // Event Listener
    userName.addEventListener('keypress', setName);
    userName.addEventListener('blur', setName);
    focus.addEventListener('keypress', setFocus);
    focus.addEventListener('blur', setFocus);

    // Run
      showTime();
      setBGnGreet();
      getUserName();
      getFocus();