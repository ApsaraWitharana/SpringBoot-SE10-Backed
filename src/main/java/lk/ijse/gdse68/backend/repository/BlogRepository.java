package lk.ijse.gdse68.backend.repository;


import lk.ijse.gdse68.backend.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BlogRepository extends JpaRepository<Blog,String> {

    //save krapu hibernet wal method access wenne
    // blog and primery key

}


