package com.example.test.boundary;

import com.example.test.codewars.control.CodewarControl;
import com.example.test.codility.CodilityControl;
import com.example.test.codility.entity.CyclicRotationRequest;
import com.example.test.hackerrank.dataStructure.HackerRankControl;
import com.example.test.hackerrank.entity.DivideRequest;
import com.example.test.hackerrank.entity.PriceRequest;
import com.example.test.hackerrank.entity.SparseArraysRequest;
import com.example.test.hackerrank.java.HackerRankJavaControl;
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
    private HackerRankControl hackerRankControl;
    private HackerRankJavaControl hackerRankJavaControl;
    private CodewarControl codewarControl;


    public TestResources(CodilityControl codilityControl, HackerRankControl hackerRankControl, HackerRankJavaControl hackerRankJavaControl, CodewarControl codewarControl) {
        this.codilityControl = codilityControl;
        this.hackerRankControl = hackerRankControl;
        this.hackerRankJavaControl = hackerRankJavaControl;
        this.codewarControl = codewarControl;
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
        int response = codilityControl.getPositive(list);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/tape-equilibrium")
    public ResponseEntity getTapeEquilibrium(@RequestBody @NotNull int[] list) {
        int response = codilityControl.getTapeEquilibrium(list);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/solution")
    public ResponseEntity solution(@RequestBody @NotNull int[] list) {
        int response = codilityControl.solution(list);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/fizz-buzz")
    public ResponseEntity getFizzBuzz(@RequestParam("number") @NotNull int n) {
        hackerRankControl.fizzBuzz(n);
        return ResponseEntity.ok("ok");
    }

    @GetMapping(path = "/sparse-arrays")
    public ResponseEntity getSparseArrays(@RequestBody @NotNull SparseArraysRequest request) {
        int[] response = hackerRankControl.sparseArrays(request.getStrings(), request.getQueries());
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/skyscrapers")
    public ResponseEntity getSkyscrapers(@RequestBody @NotNull int[] list) {
        int response = hackerRankControl.skyscrapers(list);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/find-maximum-index-product")
    public ResponseEntity getFindMaximumIndexProduct(@RequestBody @NotNull int[] list) {
        int response = hackerRankControl.findMaximumIndexProduct(list);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/currency-formatter")
    public ResponseEntity getCurrencyFormatter(@RequestParam("payment") @NotNull double payment) {
        hackerRankJavaControl.currencyFormatter(payment);
        return ResponseEntity.ok("done");
    }

    @GetMapping(path = "/ip-regex")
    public ResponseEntity getIpRegex(@RequestParam("ip") @NotNull String ip) {
        boolean response = hackerRankJavaControl.ipRegex(ip);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/price")
    public ResponseEntity getPriceCheck(@RequestBody @NotNull PriceRequest request) {
        int response = hackerRankJavaControl.priceCheck(request.getProducts(), request.getProductPrices(), request.getProductSold(), request.getSoldPrice());
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/divide")
    public ResponseEntity getPriceCheck(@RequestBody @NotNull DivideRequest request) {
        int response = hackerRankJavaControl.findSmallestDivisor(request.getS(), request.getT());
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/square")
    public ResponseEntity getSquare(@RequestParam("number") @NotNull String number) {
        Integer response = hackerRankJavaControl.calculateSquare(number);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/palindrome")
    public ResponseEntity palindrome(@RequestParam("X") @NotNull int X, @RequestParam("Y") @NotNull int Y) {
        String response = codilityControl.palindrome(X, Y);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/invert")
    public ResponseEntity invert(@RequestParam("X") @NotNull String X) {
        String response = codilityControl.invert(X);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/pig-latin")
    public ResponseEntity getPigLatin(@RequestParam("str") @NotNull String str) {
        String response = codewarControl.aa(str);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/coder-byte")
    public ResponseEntity getCoderByte(@RequestBody @NotNull String str) {
        Long response = codewarControl.coderByte(str);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/beezapps")
    public ResponseEntity getBeezapps(@RequestBody @NotNull String str) {
        double response = codewarControl.average(2,1);
        return ResponseEntity.ok(response);
    }

}
