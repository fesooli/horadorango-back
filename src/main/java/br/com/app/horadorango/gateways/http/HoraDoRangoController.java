package br.com.app.horadorango.gateways.http;

import br.com.app.horadorango.domains.Place;
import br.com.app.horadorango.usecase.PlaceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "/place", produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class HoraDoRangoController {

    private final PlaceUseCase placeUseCase;

    @RequestMapping(value="/", method = GET)
    public List<Place> listPlaces() {
        return placeUseCase.listAllPlaces();
    }

    @RequestMapping(value="/{placeId}", method = GET)
    public Place getPlace(@PathVariable Integer placeId) {
        return placeUseCase.getMenuPlace(placeId);
    }

}
