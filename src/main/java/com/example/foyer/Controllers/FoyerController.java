package com.example.foyer.Controllers;


import com.example.foyer.Services.IFoyerService;
import com.example.foyer.entities.Bloc;
import com.example.foyer.entities.Foyer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("api/foyer")
@Tag(name = "Foyer", description = "Foyer API")
public class FoyerController {
    IFoyerService foyerService;

    @PostMapping("addfoyer")
    @Operation(summary = "Ajouter un foyer")
    public Foyer ajoutFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @GetMapping("getallfoyers")
    public List<Foyer> getAllFoyers() {
        return foyerService.getAllFoyers();
    }

    @GetMapping("getFoyer/{idfoyer}")
    public Foyer getFoyerById(@PathVariable("idfoyer") int idFoyer) {
        return foyerService.getFoyerById(idFoyer);
    }

    @DeleteMapping("deletefoyer")
    public void deleteFoyer(@RequestBody Foyer foyer) {
        foyerService.deleteFoyer(foyer);
    }

    @PutMapping("updatefoyer")
    public Foyer modifierFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @PutMapping("assignBlocToFoyer/{idBloc}/{idFoyer}")
    public void assignBlocToFoyer(@PathVariable("idBloc") int idBloc , @PathVariable ("idFoyer") int idFoyer) {
        foyerService.assignBlocToFoyer(idBloc, idFoyer);
        System.out.println("Bloc assigné avec succes");
    }

//    @GetMapping("getBlocByUniversite/{idUniversite}")
//    public List<Bloc> getBlocByUniversite(@PathVariable ("idUniversite") int idUniversite) {
//        return foyerService.getBlocByUniversite(idUniversite);
//    }
}
