# Api Endepoints

# Get List of Animals
> `GET /animals/all` <br>
> `http://localhost:8080/animals/all`

## Response
>{ "animalId": 1, "name": "Sample1", "scientificName": "Sample1", "species": "Sample1", "habitat": "Sample1", "description": "Sample1"} <br>
>{ "animalId": 2, "name": "Sample2", "scientificName": "Sample2", "species": "Sample2", "habitat": "Sample2", "description": "Sample2"} <br>
>{ "animalId": 3, "name": "Sample3", "scientificName": "Sample3", "species": "Sample3", "habitat": "Sample3", "description": "Sample3"} <br>

# Get a Specific Animal
> `GET /animal/{animalId}` <br>
>  `http://localhost:8080/animals/all`

# Response
> { "animalId": 1, "name": "Sample1", "scientificName": "Sample1", "species": "Sample1", "habitat": "Sample1", "description": "Sample1"}

# Create a New Animal
>
