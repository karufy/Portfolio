package org.ochiugo.casestudy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ochiugo.casestudy.modelentity.Software;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SoftwaredownloadcenterApplicationTests {

	public void testSoftwareNoArgsConstructor() {
        // Arrange & Act
        Software software = new Software();

        // Assert
        Assertions.assertEquals(0, software.getId());
        Assertions.assertNull(software.getName());
        Assertions.assertNull(software.getCompany());
        Assertions.assertNull(software.getPrice());
    }

    @Test
    public void testSoftwareAllArgsConstructor() {
        // Arrange
        int expectedId = 31;
        String expectedName = "NexusIQ";
        String expectedCompany = "Sonatype";
        String expectedPrice = "50";

        // Act
        Software software = new Software(expectedId, expectedName, expectedCompany, expectedPrice);

        // Assert
        Assertions.assertEquals(expectedId, software.getId());
        Assertions.assertEquals(expectedName, software.getName());
        Assertions.assertEquals(expectedCompany, software.getCompany());
        Assertions.assertEquals(expectedPrice, software.getPrice());
    }

    @Test
    public void testSoftwareGettersAndSetters() {
        // Arrange
        Software software = new Software();
        int expectedId = 32;
        String expectedName = "Coverity";
        String expectedCompany = "Synopsis";
        String expectedPrice = "30";

        // Act
        software.setId(expectedId);
        software.setName(expectedName);
        software.setCompany(expectedCompany);
        software.setPrice(expectedPrice);

        // Assert
        Assertions.assertEquals(expectedId, software.getId());
        Assertions.assertEquals(expectedName, software.getName());
        Assertions.assertEquals(expectedCompany, software.getCompany());
        Assertions.assertEquals(expectedPrice, software.getPrice());
    }
}
