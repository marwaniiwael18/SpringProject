package com.example.foyer.Controllers;

import com.example.foyer.Services.IUniversiteService;
import com.example.foyer.entities.Foyer;
import com.example.foyer.entities.Universite;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("api/universite")
@Tag(name = "Universite", description = "Universite API")
public class UniversiteController {

    IUniversiteService universiteService;

    @PostMapping("adduniversite")
    @Operation(summary = "Ajouter une universite")
    public Universite ajoutUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @GetMapping("getalluniversites")
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversites();
    }

    @GetMapping("getuniversite/{iduniversite}")
    public Universite getUniversite(@PathVariable("iduniversite") int idUniversite) {
        return universiteService.getUniversiteById(idUniversite);
    }

    @DeleteMapping("deleteuniversite")
    public void deleteUniversite(@RequestBody Universite universite) {
        universiteService.deleteUniversite(universite);
    }

    @PutMapping("updateuniversite")
    public Universite modifierUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @PostMapping("affecterFoyerToUniversite")
    public Universite affecterFoyerToUniversite(@RequestBody Universite universite) {
        return universiteService.affecterFoyerToUniversite(universite);
    }

    @PostMapping("affecterFoyerToUniversite/{idUniversite}")
    @ResponseBody
    public Universite affecterFoyerToUniversite(@RequestBody Foyer foyer, @PathVariable("idUniversite") int idUniversite) {
        Universite universite1 = universiteService.affecterFoyerToUniversite(idUniversite , foyer);
        return universite1;
    }

    @PutMapping("DesaffecterFoyerFromUniversite/{universiteId}")
    public Universite DesaffecterFoyerFromUniversite(@PathVariable("universiteId") int universiteId) {
        universiteService.DesaffecterFoyerFromUniversite(universiteId);
        return universiteService.getUniversiteById(universiteId);
    }


}
