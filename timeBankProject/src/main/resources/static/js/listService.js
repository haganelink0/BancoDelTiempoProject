
$(document).ready(function() {

$.get("http://localhost:8082/jopApi",function(job){
    console.log(job)
    job.forEach(function(jobsUser) {
        $("userJobsTable").append(templateTable(jobsUser));
          })	
      })
})
function templateTable(jobsUser) {
    var template =
`<tr>
     <td>${jobsUser.category}</td>
     <td>${jobsUser.description}</td>
     <td>${jobsUser.location}</td>
</tr>`
return template;
}


