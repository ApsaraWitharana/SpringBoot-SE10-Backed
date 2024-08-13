package lk.ijse.gdse68.backend.controller;

import lk.ijse.gdse68.backend.entity.Blog;
import lk.ijse.gdse68.backend.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//
@RestController
//mapping  req clss run
//    http://localhost:8080/blog
@RequestMapping("blog")
@CrossOrigin
public class BlogController {
    //inject to java class - prperty format
    // convert string auto create object
    //blogRepository
    @Autowired
    private BlogRepository blogRepository;

    //    http://localhost:8080/blog/hellow
    @GetMapping("/hellow")
    public String hellow(){
        return "HELLO WORLD!!";
    }
    @PostMapping("/number")
//    http://localhost:8080/blog/number =>colling postman =req type post
    public int getNumber(){
        return 9;
    }

    //Spring boot path variable request
//http://localhost:8080/blog/api/employees/C001
    //pass every id:string,boolean,double,int ==@PathVariable String id=>{id} -url eke path eke den ekt
    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String id) {
        return "ID: " + id;
    }

//    return data 01
    @GetMapping("/object")
    @ResponseBody
    public Object getObject() {
        Blog obj = new Blog();
        return obj;
    }

    @PostMapping("/savepost")
    //databine eken json ob ek java ob wen eken assing wenne blog ekn
    public void savePost(@RequestBody Blog blog){
        System.out.println(blog);
     blogRepository.save(blog);

    }
//db data send postman
    @GetMapping("/getAll")
    public List<Blog> getAll() {
       return blogRepository.findAll();
    }


    @DeleteMapping("/deletepost/{id}")
    public void deletePost(@PathVariable String id){
        System.out.println(id);
        blogRepository.deleteById(id);
    }

    @PutMapping("/updatepost") // server data updating use  put
    public Blog updatePost(@RequestBody Blog blog){
        System.out.println(blog);
        System.out.println("sorry!!! -->>>>>>>please come!!");
       return blogRepository.save(blog);


}

}

//please come.........