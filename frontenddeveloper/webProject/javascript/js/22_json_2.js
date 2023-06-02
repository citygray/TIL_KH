let company ={
    "name" : "(주)자바컴퍼니",
    "since": 2013,
    "department": ["기획팀","영업팀","디자인팀","개발팀"],
    "biz":["소프트웨어개발","통신판매업"]
};
window.onload = function(){
    document.getElementById("name").innerText = company.name;
    document.getElementById("since").innerText = company.since;
    
    //사업부서
    let departmentLi ="";
    company.department.forEach((ele)=>{
        departmentLi += "<li>"+ele+"</li>";
    })
    document.getElementById("department").innerHTML = departmentLi;

    //사업분야
    let bizLi ="";
    company.biz.forEach((ele)=>{
        bizLi += "<li>"+ele+"</li>";
    })
    document.getElementById("biz").innerHTML = bizLi;
}