let subject ={
    "title": "과목게시판",

    //"totalCount" : 0,
    "notice": [
        {"id":1,"title":"클라이언트 프로그래밍","count":3,"date":"2017.12.14"}      
    ],
    "board": [
        {"id":1,"title":"Ajax","count":3,"date":"2017.12.14"},
        {"id":2,"title":"jquery","count":3,"date":"2017.12.14"},
     
    ]
}

window.onload = function(){
    let tag = "<h1>" +subject.title+"</h1>";
    tag += "<table><tbody><thead><tr><th>번호</th><th>제목</th><th>조회수</th><th>등록일</th></tr></thead>"

    let boardCount = 0;
    subject.notice.forEach((ele)=>{
        tag += "<tr>";
        tag += "<td>"+"공지"+"</td>";
        tag += "<td>"+ele.title+"</td>";
        tag += "<td>"+ele.count+"</td>";
        tag += "<td>"+ele.date+"</td>";
        tag += "</tr>";
        boardCount++;
    }); 

    subject.board.forEach((ele)=>{
        tag += "<tr>";
        tag += "<td>"+ele.id+"</td>";
        tag += "<td>"+ele.title+"</td>";
        tag += "<td>"+ele.count+"</td>";
        tag += "<td>"+ele.date+"</td>";
        tag += "</tr>";
        boardCount++;
    }); 
    tag+="</tbody></table>"

    document.getElementById("data_area").innerHTML = tag;
    document.getElementById("boardCount").innerText = boardCount;
        
}