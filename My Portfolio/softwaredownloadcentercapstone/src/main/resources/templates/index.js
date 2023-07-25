//Ignore file for future use

/*const accessKey = "Smb0W5FZrQASJiO3OACxUXyp51K1RF2C6uL_ynkGMn4";

const searchForm = document.getElementById("search-form");

const searchResult = document.getElementById("search-result");

const searchBox = document.getElementById("search-box");

const showMoreBtn= document.getElementById("show-more-btn");

let keyword = "";
let page = 1;

async function searchImages (){
    keyword = searchBox.value;
    const url = `http://api.unsplash.com/search/photos?page=${page}&query=${keyword}&client_id=<API_KEY>&client_secret=<API_SECRET>&grant_type=client_credentials&per_page=12`;

    const response = await fetch(url);
    const data = await response.json();

    if (page === 1){
        searchResult.innerHTML = "";
        }

    const results = data.results;
    results.map((result) => {
        const image = document.createElement("img");
        image.src = result.urls.small;
        const imageLink =document.createElement("a");
        imageLink.href = result.links.html;
        imageLink.target = "_blank";

        imageLink.appendChild(image);
        searchResult.appendChild(imageLink);
    })
    showMoreBtn.style.display = "_block"
}

searchForm.addEventListener("submit", (e) =>{
    e.preventDefault();
    page = 1;
    searchImages();
})

showMoreBtn.addEventListener("click", ()=>{
    page++;
})
page++;
if(page > 1){
showMore.style.display = "block";
}



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Software Finder</title>
</head>
<body>
	<h1> Hello User... What is your Name?</h1>
	<input id="userInput"> <br><br>
	<button  onclick="myFunction()">Submit</button>
	<h1 id="message"></h1>
	
	<style>
		body{background-color: gray; text-align: center; color: floralwhite;}
	</style>
	
	<script>
		function myFunction (){
			alert("You will be re-directed to an External Site beware of Viruses!!!") 
			const userInput = document.querySelector("#userInput");
			let message = document.querySelector("#message");
			
			message.innerHTML = "Welcome " + userInput.value + " to the External Software Finder Repo";
			
		}
	</script>
</body>
</html>



*/