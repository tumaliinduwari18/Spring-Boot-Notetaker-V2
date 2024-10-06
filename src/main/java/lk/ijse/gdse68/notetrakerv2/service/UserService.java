package lk.ijse.gdse68.notetrakerv2.service;



import lk.ijse.gdse68.notetrakerv2.customObj.UserResponse;
import lk.ijse.gdse68.notetrakerv2.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(String userId);
    UserResponse getSelectedUser(String userId);
    List<UserDTO> getAllUsers();
}
