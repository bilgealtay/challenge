package com.example.test.boundary;

import com.example.test.alscient.AlscientControl;
import com.example.test.codility.CodilityControl;
import com.example.test.codility.entity.CyclicRotationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by bilga on 07-11-2020
 */
@RestController
@RequestMapping(path = "/test")
public class TestResources {

    private CodilityControl codilityControl;
    private AlscientControl alscientControl;

    public TestResources(CodilityControl codilityControl, AlscientControl alscientControl) {
        this.codilityControl = codilityControl;
        this.alscientControl = alscientControl;
    }

    @GetMapping(path = "/binary-gap")
    public ResponseEntity getBinaryGap(@RequestParam("number") @NotNull int N) {
        int response = codilityControl.getBinaryGap(N);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/reverse")
    public ResponseEntity getBinaryGap(@RequestBody @NotNull List<Integer> list) {
        List<Integer> response = codilityControl.reverseArray(list);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/cyclic-rotation")
    public ResponseEntity getBinaryGap(@RequestBody @NotNull CyclicRotationRequest request) {
        int[] response = codilityControl.cyclicRotation(request.getArray(), request.getIndex());
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/odd-number")
    public ResponseEntity getBinaryGap(@RequestBody @NotNull int[] list) {
        int response = codilityControl.oddOccurrencesInArray(list);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/frog-jump")
    public ResponseEntity getBinaryGap(@RequestParam("X") @NotNull int X, @RequestParam("Y") @NotNull int Y, @RequestParam("D") @NotNull int D) {
        int response = codilityControl.getCountOfFrogJump(X, Y, D);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/perm-missing-elem")
    public ResponseEntity getPermMissingElem(@RequestBody @NotNull int[] list) {
        int response = codilityControl.getPermMissingElem(list);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/tape-equilibrium")
    public ResponseEntity getTapeEquilibrium(@RequestBody @NotNull int[] list) {
        int response = codilityControl.getTapeEquilibrium(list);
        return ResponseEntity.ok(response);
    }
}
