package com.example.springvue.funeral_homes;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/* I looked up "Paging and Sorting Repository" and it seems that JPA Repository
  everything PagingAndSortingRepository does plus CrudRepository functions */

//as a result, I'm thinking of using this rather than Page and Sort in case we need CrudRepo
@Repository
public interface FuneralHomeRepository extends JpaRepository<FuneralHome, Long> {
    //the two generics represent the Class we're storing and the DataType of its ID

}
