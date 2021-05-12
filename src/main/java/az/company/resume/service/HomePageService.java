package az.company.resume.service;

import az.company.resume.dto.request.UserDto;
import az.company.resume.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class HomePageService {
    private final UserRepository userRepository;

    public HomePageService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUser() {
        return userRepository.findById(1L).map(UserDto::toDto).orElseThrow(RuntimeException::new);
    }
}

