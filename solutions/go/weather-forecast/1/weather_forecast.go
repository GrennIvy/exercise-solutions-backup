// Package weather is a program that can forecast the current weather condition of various cities in Goblinocus.
package weather

var (
	// CurrentCondition describes the current weather condition.
	CurrentCondition string
	// CurrentLocation describes the current location.
	CurrentLocation string
)

// Forecast returns the current weather condition of a given city.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
