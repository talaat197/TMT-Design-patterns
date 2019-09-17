<?php

class Employee {
	private $id;
	private $name;

	public function __construct($id , $name)
	{
		$this->id = $id;
		$this->name = $name;
	}

	public function getId()
	{
		return $this->id;
	}

	public function getName()
	{
		return $this->name;
	}

	public function doSomething()
	{
		echo "i am {$this->name} and i am working hard";
	}
}

class EmployeePool
{
	private $freeWorkers = [];
	private $occupiedWorkers = [];
	CONST AVAILABLE_WORKERS = ['tmt' , 'mohamed' , 'ali'];
	
	public function getEmployee()
	{
		if(count($this->freeWorkers) == 0)
		{
			$id = count($this->freeWorkers) + count($this->occupiedWorkers);

			$name = array_rand(self::AVAILABLE_WORKERS , 1);

			$employee = new Employee($id , $name);
		}
		else
		{
			$employee = array_pop($this->freeWorkers);
		}

		$this->occupiedWorkers[$employee->getId()] = $employee;

		return $employee;
	}

	public function release($employee)
	{
		if(isset($this->occupiedWorkers[$employee->getId()]))
		{
			unset($this->occupiedWorkers[$employee->getId()]);
			$this->freeWorkers[$employee->getId()] = $employee;
		}
	}
}

$pool = new EmployeePool();

$employee1 = $pool->getEmployee();
$employee2 = $pool->getEmployee();

$employee1->doSomething();
$employee2->doSomething();

$pool->release($employee1);

$employee3 = $pool->getEmployee();

$employee3->doSomething();