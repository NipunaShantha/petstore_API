# PetStore Application

## Introduction

This an assignment for SCS3203

## Packaging and running the application

If you want to build an _??ber-jar_, execute the following command:

    ./gradlew build -Dquarkus.package.type=uber-jar

To run the application:

    java -jar build/petstoreAPI-runner.jar

The application can be also packaged using simple:

    ./gradlew build


## Testing

To test the application:

    ./gradlew test


## API Requests

#### Get All Pets
	curl --location --request GET 'http://localhost:8080/v1/pets'

#### Add New Pet to the List
	curl --location --request POST 'http://localhost:8080/v1/pets/add' \
	--header 'Content-Type: application/json' \
	--data-raw '{
		"petName": "Kitty",
		"petType": "Cat",
		"petAge": 5
	}'
	
#### Update an Exisitng Pet of list
	curl --location --request PUT 'http://localhost:8080/v1/pets/update/{petId}' \
	--header 'Content-Type: application/json' \
	--data-raw '{
		"petName": "Kitty",
		"petType": "Cat",
		"petAge": 12
	}'

#### Get an Exisitng Pet of list	
	curl --location --request GET 'http://localhost:8080/v1/pets/get/{petId}'
	
#### Delete an Exisitng Pet of list	
	curl --location --request DELETE 'http://localhost:8080/v1/pets/delete/{petId}'
	
#### Get All Pet Types
	curl --location --request GET 'http://localhost:8080/v1/pets/type'	
	
#### Get an Exisitng Pet Type of list		
	curl --location --request POST 'http://localhost:8080/v1/pets/type/add' \
	--header 'Content-Type: application/json' \
	--data-raw '{
		"petType": "Cat"
	}'	

#### Delete an Exisitng Pet of list	
	curl --location --request DELETE 'http://localhost:8080/v1/pets/type/delete' \
	--header 'Content-Type: application/json' \
	--data-raw '{
		"petType": "Dog"
	}'
	
	
	
	