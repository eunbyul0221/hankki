--돼지김치찌개
insert into Recipe ( recipeId, recipeName, recipeCategoryType, recipeDescription, cookingTime, calory ) values ( 1, '돼지김치찌개', '한식','김치찌개', 30, 200)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (1, 'true', 11, 1)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (2, 'true', 8, 1)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (3, 'false', 12, 1)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (4, 'false', 9, 1)
--햄김치볶음밥
insert into Recipe ( recipeId, recipeName, recipeCategoryType, recipeDescription, cookingTime, calory ) values ( 2, '햄김치볶음밥', '한식','볶음밥', 20, 250)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (15, 'TRUE', 4, 2)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (16, 'TRUE', 15, 2)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (17, 'TRUE', 8, 2)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (18, 'FALSE', 6, 2)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (19, 'FALSE', 7, 2)
--차돌박이된장찌개
insert into Recipe ( recipeId, recipeName, recipeCategoryType, recipeDescription, cookingTime, calory ) values ( 3, '차돌박이된장찌개', '한식','된장찌개', 30, 150)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (110, 'TRUE', 14, 3)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (111, 'TRUE', 16, 3)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (112, 'FALSE', 12, 3)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (113, 'FALSE', 9, 3)
--냉이된장국
insert into Recipe ( recipeId, recipeName, recipeCategoryType, recipeDescription, cookingTime, calory ) values ( 4, '냉이된장국', '한식','된장국', 30, 150)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (114, 'TRUE', 17, 4)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (115, 'TRUE', 14, 4)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (116, 'FALSE', 12, 4)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (117, 'FALSE', 9, 4)
--토마토 스파게티
insert into Recipe ( recipeId, recipeName, recipeCategoryType, recipeDescription, cookingTime, calory ) values ( 5, '토마토 스파게티', '양식','스파게티', 30, 350)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (118, 'TRUE', 18, 5)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (119, 'TRUE', 19, 5)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (120, 'FALSE', 2, 5)
insert into RecipeMaterial (id, mandantory, materialId, recipeId) values (121, 'FALSE', 20, 5)
