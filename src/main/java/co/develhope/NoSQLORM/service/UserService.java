package co.develhope.NoSQLORM.service;

import co.develhope.NoSQLORM.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserService extends MongoRepository<User, String> {
}
