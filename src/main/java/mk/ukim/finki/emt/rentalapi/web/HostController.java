package mk.ukim.finki.emt.rentalapi.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import mk.ukim.finki.emt.rentalapi.model.domain.Host;
import mk.ukim.finki.emt.rentalapi.service.HostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hosts")
@RequiredArgsConstructor
@Tag(name = "Hosts", description = "Operations related to hosts")
public class HostController {

    private final HostService hostService;

    @GetMapping
    @Operation(summary = "Get all hosts")
    public ResponseEntity<List<Host>> findAll() {
        return ResponseEntity.ok(hostService.findAll());
    }
}
