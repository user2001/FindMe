package com.example.findme.appuser;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface AppUserRepo extends MongoRepository<AppUser, ObjectId> {
    Optional<AppUser> findByEmail(String email);
}
