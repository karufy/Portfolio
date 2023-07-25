window.addEventListener('load', ()=> {
    let long;
    let lat;

    if (navigator.geolocation){
        navigator.geolocation.getCurrentPosition(position => {
            long = position.coords.longitude;
            lat = position.coords.latitude;

            const proxy = "http://corsproxy.nodester.com/";
            const api = `${proxy}https://api.open-meteo.com/v1/forecast?${lat}&${long}&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m`;

            fetch (api)
                .then(response => {
                    return response.json();
                })
                .then(data =>{
                    console.log(data);
                });
        });
    }
});