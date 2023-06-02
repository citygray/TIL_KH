//배열을 선언앟고 하위 데이터 요소로서 json 포함
let keyword_rank ={
    "title":"인기 검색어 순위",
    "rank": [
        {"keyword":"HTML5","s":"+","v":178},
        {"keyword":"Css3","s":"new","v":150},
        {"keyword":"Jqurry","s":"+","v":135}
    ]
}

window.onload = function(){
    let tag = "<h1>" +keyword_rank.title+"</h1><ul>";
    keyword_rank.rank.forEach((ele)=>{
        tag += "<li>"+ele.keyword+"("+ele.s+ele.v+")"+"</li>"
    }); 
    tag+="</ul>"

    document.write(tag);
    
}