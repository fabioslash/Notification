var crudAtendimento = angular.module('crudAtendimento', ["ngResource"]);

crudAtendimento.controller("DenunciaController", ["$resource", "$scope", function($resource, $scope) {
	
	var angularResource = $resource("/SistemaDenuncia/ws/denuncia");
	var angularResourceParam = $resource("/SistemaDenuncia/ws/denuncia/:protocolo", {protocolo : "@protocolo"});
	
	$scope.denuncias = angularResource.query(function(){});
	
	$scope.salvar = function() {
		var newResource = new angularResource($scope.denuncia);
		newResource.$save(function(){
			$scope.denuncias.push(newResource);
			$scope.novo(); 
		});
	}
	
	

	
	
	
	$scope.editar = function() {
		var newResource = new angularResource($scope.denuncia);
		newResource.$save(function(){
			$scope.novo(); 
		});
	}
	
	$scope.excluir = function() {
		var newResource = new angularResourceParam($scope.denuncia);
		newResource.$delete(function() {
			$scope.denuncias.splice($scope.denuncias.indexOf($scope.denuncia), 1);
			$scope.novo();  
		});
	}
	
	$scope.novo = function () { 
		$scope.denuncia = "";
	}; 	
	
	$scope.seleciona = function (denuncia) {
		$scope.denuncia = denuncia; 								  
	};	
	
}])