package lk.ijse.gdse68.notetrakerv2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NoteTrakerV2Application {

    public static void main(String[] args) {
        SpringApplication.run(NoteTrakerV2Application.class, args);
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
