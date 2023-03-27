package com.example.springvue.funeral_streams;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.Optional;
/* I looked up "Paging and Sorting Repository" and it seems that JPA Repository
  everything PagingAndSortingRepository does plus CrudRepository functions */

//as a result, I'm thinking of using this rather than Page and Sort in case we need CrudRepo
@Repository
public interface FuneralStreamRepository extends JpaRepository<FuneralStream, Long> {
    //the two generics represent the Class we're storing and the DataType of its ID

    Optional<FuneralStream> findFuneralStreamsByFuneralHomeID(long funeralHomeID);
    //Optional<FuneralStream> queryFuneralStreamByVimeoIDMatchesAnd

    @Modifying //as can be seen here, this is an update query the Changes StartTime
    @Transactional
    @Query("update FuneralStream funeralStream set funeralStream.startTimestamp = ?2 where funeralStream.funeralStreamId = ?1")
    void changeStreamStartTime(long streamID, Timestamp newTimestamp);

}
