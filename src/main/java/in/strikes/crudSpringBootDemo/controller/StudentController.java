package in.strikes.crudSpringBootDemo.controller;


import in.strikes.crudSpringBootDemo.entity.Student;
import in.strikes.crudSpringBootDemo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//yeh lagaye kyuki yeh api leta hai and output deta hai
@RequestMapping ("/api/students")   // yeh api banayega end points for browser @GetMapping ke liye shortchut hai for get only jabki requestmaping har chijo ke liye hai CRUD
public class StudentController {
    //create student POST --> /API/STUDENTS/CREATE
    //READ --> GET --> /API/STUDENTS/GET/1-> YEH ID HAI
    //READ ALL ---> /API/STUDNETS/GETALL SAME NHI HAI WOH POST AND YEH YEH READ HAI
    //UPDATE --> PUT -->/API/STUDENTS/UPDATE/DELETE/{ID}--> KYUKI YEH UNIQUE HAI ESLY
    //DELETE --> /API/STUDENTS/{ID}

    private StudentService studentService;
     private StudentController(StudentService studentService){
         this.studentService= studentService;
     }

    @PostMapping("/create")// api/students krte hai toh ye post wala call hoga sabse pahle
    // @GetMapping       // Read
    //@PostMapping      // Create
    //@PutMapping       // Update
    //@DeleteMapping    // Delete
    public String createStudent(@RequestBody Student student) {
       Student ceratedStudent =  studentService.createStudent(student);
       return "Student Created";
    }
}



