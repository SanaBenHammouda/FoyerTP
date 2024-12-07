package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Repositories.BlocRepository;
import tn.esprit.spring.Services.Bloc.BlocService;
import org.mockito.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.ExpectedCount.times;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  // Ensures test method order
public class BlocServiceMockTest {

    @MockBean
    private BlocRepository blocRepository;

    private BlocService blocService;


}
