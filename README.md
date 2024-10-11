# Api Endepoints

# Get List of Animals

## Request
> `GET /animals/all` <br>
> `http://localhost:8080/animals/all`

## Response
>{ "animalId": 1, "name": "Blue Jay", "scientificName": "Sample1", "species": "Bird", "habitat": "Forest", "description": "Sample1"} <br>
>{ "animalId": 2, "name": "Tiger", "scientificName": "Sample2", "species": "Tiger", "habitat": "Savanna", "description": "Sample2"} <br>
>{ "animalId": 3, "name": "Blue Whale", "scientificName": "Sample3", "species": "Whale", "habitat": "Ocean", "description": "Sample3"} <br>

# Get a Specific Animal

## Request
> `GET /animals/{animalId}` <br>
>  `http://localhost:8080/animals/all`

## Response
> { "animalId": 1, "name": "Blue Jay", "scientificName": "Sample1", "species": "Bird", "habitat": "Forest", "description": "Sample1"}

# Create a New Animal

## Request
>`POST /animals/new` <br>
>`http://localhost:8080/animals/new` --data `{ "animalId": 4, "name": "Humming Bird", "scientificName": "Sample4", "species": "Bird", "habitat": "Sample4", "description": "Sample4"}`

## Response
>{ "animalId": 1, "name": "Blue Jay", "scientificName": "Sample1", "species": "Bird", "habitat": "Forest", "description": "Sample1"} <br>
>{ "animalId": 2, "name": "Tiger", "scientificName": "Sample2", "species": "Tiger", "habitat": "Savanna", "description": "Sample2"} <br>
>{ "animalId": 3, "name": "Blue Whale", "scientificName": "Sample3", "species": "Whale", "habitat": "Ocean", "description": "Sample3"} <br>
>{ "animalId": 4, "name": "Humming Bird", "scientificName": "Sample4", "species": "Bird", "habitat": "Forest", "description": "Sample4"}

# Get Animal by Species

## Request
>`GET /animals?species=Bird` <br>
>`http://localhost:8080/animals?species=Bird`

## Response
>{ "animalId": 1, "name": "Blue Jay", "scientificName": "Sample1", "species": "Bird", "habitat": "Forest", "description": "Sample1"} <br>
>{ "animalId": 4, "name": "Humming Bird", "scientificName": "Sample4", "species": "Bird", "habitat": "Forest", "description": "Sample4"}

# Get Animal by Name (Containing a String)

## Request
> `GET /animals/search?name={string}`
> `http://localhost:8080/animals/search?name=Blue`

## Response
>{ "animalId": 1, "name": "Blue Jay", "scientificName": "Sample1", "species": "Bird", "habitat": "Forest", "description": "Sample1"} <br>
>{ "animalId": 3, "name": "Blue Whale", "scientificName": "Sample3", "species": "Whale", "habitat": "Ocean", "description": "Sample3"}

# Get Animals by Habitat

## Request
> `GET /animals/habitat?habitat={habitat}`
> `http://localhost:8080/animals/habitat?habitat=Savanna`

## Response
>{ "animalId": 2, "name": "Tiger", "scientificName": "Sample2", "species": "Tiger", "habitat": "Savanna", "description": "Sample2"}

# Update an Existing Animal

## Request
> `PUT /animals/update/{animalId}`
> `http://localhost:8080/animals/update/1` --data `{"name": "SampleUpdate", "scientificName": "SampleUpdated", "species": "SampleUpdated", "habitat": "SampleUpdated", "description": "SampleUpdated"}`

## Response
>{"animalId": 1, "name": "SampleUpdate", "scientificName": "SampleUpdated", "species": "SampleUpdated", "habitat": "SampleUpdated", "description": "SampleUpdated"}

# Delete an Animal

## Request
> `DELETE /animals/delete/{animalId}`
> `http://localhost:8080/animals/delete/1`

## Response
>{ "animalId": 2, "name": "Tiger", "scientificName": "Sample2", "species": "Tiger", "habitat": "Savanna", "description": "Sample2"} <br>
>{ "animalId": 3, "name": "Blue Whale", "scientificName": "Sample3", "species": "Whale", "habitat": "Ocean", "description": "Sample3"} <br>
>{ "animalId": 4, "name": "Humming Bird", "scientificName": "Sample4", "species": "Bird", "habitat": "Forest", "description": "Sample4"}
