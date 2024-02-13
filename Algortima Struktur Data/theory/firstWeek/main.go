package main

import (
	"fmt"
)

// show number from 1 to 10 but odd numbers replaced by "*" except 6 and 10

func printNumbers() {

	for num := 1; num <= 15; num++ {

		if num == 6 || num == 10 || num%2 != 0 {
			fmt.Print("*" + " ")

		} else {
			fmt.Printf("%d ", num)
		}
	}

}

func calculateEachFilmAverage(arr []int) float64 {
	var total float64 = 0

	for _, movie := range arr {
		total += float64(movie)
	}

	// divided by 3 because each col length is 3
	return total / 3
}

func getFilmMinMaxAvg(film []float64) (min float64, max float64) {
	min = film[0]
	max = film[0]

	for i := 0; i < len(film); i++ {
		// get min
		if min > film[i] {
			min = film[i]
		}

		// get max
		if max < film[i] {
			max = film[i]
		}
	}
	return min, max
}

func main() {

	films := [][]int{
		// col is film
		{4, 3, 4, 4}, // row is viewer
		{1, 1, 2, 3},
		{1, 2, 3, 4},
	}

	film := [][]int{}

	// itterate each collum of films
	for i := 0; i < len(films[0]); i++ {
		// define empty array for storing film
		currentFilm := []int{}

		for j := 0; j < len(films); j++ {
			currentFilm = append(currentFilm, films[j][i])
		}

		film = append(film, currentFilm)
	}

	// each movie average rating
	averageEachFilm := []float64{}

	for i := 0; i < 4; i++ {
		averageEachFilm = append(averageEachFilm, float64(calculateEachFilmAverage(film[i])))
	}

	min, max := getFilmMinMaxAvg(averageEachFilm)

	fmt.Println(averageEachFilm)
	fmt.Println(min)
	fmt.Println(max)
}
