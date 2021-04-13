curl --location --request POST 'localhost:8080/recipes' \
--header 'Content-Type: application/json' \
--data-raw '{
    "mealCategories": ["LUNCH"]
}'
