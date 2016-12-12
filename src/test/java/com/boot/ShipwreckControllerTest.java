package com.boot;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController sc;
=
    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet(){
        Shipwreck sw = new Shipwreck();
        sw.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(sw);

        Shipwreck wreck = sc.get(1L);
        //check whether this method is called once. The test will fail if its called twice.
        verify(shipwreckRepository).findOne(1L);
        assertEquals(1L, wreck.getId().longValue());
    }

    @Test
    public void testShipwreckPost(){
        Shipwreck wreck = new Shipwreck();
        wreck.setId(2L);
        wreck.setName("testPost");
        wreck.setDescription("PostDescription");
        wreck.setConditions("oke");
        wreck.setYear_Discovered(1987);
        wreck.setDepth(100);
        wreck.setLatitude(20d);
        wreck.setLongitude(20d);

        when(shipwreckRepository.saveAndFlush(any(Shipwreck.class))).thenReturn(wreck);
        Shipwreck returnwreck = sc.create(wreck);
        verify(shipwreckRepository).saveAndFlush(wreck);
        assertNotNull(returnwreck);
    }


}
