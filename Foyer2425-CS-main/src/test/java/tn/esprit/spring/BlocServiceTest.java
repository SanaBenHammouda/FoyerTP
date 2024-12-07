package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.Services.Bloc.BlocService;

import java.util.Arrays;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BlocServiceTest {

    @Autowired
    private BlocService blocService;

    @BeforeEach
    void beforeEach() {
        // Initialize or set up test data if needed
    }

    @AfterEach
    void afterEach() {
        // Clean up after each test if necessary
    }

    @Order(1)
    @Test
    void testAddOrUpdate() {
        Bloc bloc = new Bloc();
        bloc.setNomBloc("Bloc 1");

        Chambre chambre1 = new Chambre();
        chambre1.setNumeroChambre(101);
        Chambre chambre2 = new Chambre();
        chambre2.setNumeroChambre(102);

        bloc.setChambres(Arrays.asList(chambre1, chambre2));

        Bloc savedBloc = blocService.addOrUpdate(bloc);

        Assertions.assertNotNull(savedBloc);
        Assertions.assertEquals("Bloc 1", savedBloc.getNomBloc());
        Assertions.assertEquals(2, savedBloc.getChambres().size());
    }
}
