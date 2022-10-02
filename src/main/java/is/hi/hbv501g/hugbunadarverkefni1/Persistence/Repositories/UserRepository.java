package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;

import java.util.List;

public interface UserRepository {
    public User save(User user);
    public void delete(User user);
    public List<User> findAll();
    public User findByUserId(String userID);
}