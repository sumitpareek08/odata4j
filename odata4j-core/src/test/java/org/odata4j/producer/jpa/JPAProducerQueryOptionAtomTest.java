package org.odata4j.producer.jpa;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JPAProducerQueryOptionAtomTest extends JPAProducerTestBase {

	@BeforeClass
	public static void setUpClass() throws Exception {
		setUpClass(20);
	}
	
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
	@Test
	public void SystemQueryOptionOrderByTest() {
		String inp = "SystemQueryOptionOrderByTest";
		String uri = "Products?$top=20&$orderby=ProductID";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionOrderByDescTest() {
		String inp = "SystemQueryOptionOrderByDescTest";
		String uri = "Products?$top=10&$orderby=ProductID desc";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionTopTest() {
		String inp = "SystemQueryOptionTopTest";
		String uri = "Products?$top=5";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionOrderByTopTest() {
		String inp = "SystemQueryOptionOrderByTopTest";
		String uri = "Products?$top=5&$orderby=ProductName desc";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionSkipTest() {
		String inp = "SystemQueryOptionSkipTest";
		String uri = "Categories(1)/Products?$skip=2";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionOrderBySkipTest() {
		String inp = "SystemQueryOptionOrderBySkipTest";
		String uri = "Products?$skip=2&$top=2&$orderby=ProductName";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	// @Test
	// public void SystemQueryOptionTop5000Test() {
	// String inp = "SystemQueryOptionTop5000Test";
	// String uri = "Products?$top=5000";
	// TestUtils.testAtomResult(endpointUri, uri, inp);
	// }

	@Test
	public void SystemQueryOptionSkipTokenTest() {
		String inp = "SystemQueryOptionSkipTokenTest";
		String uri = "Customers?$top=5&$skiptoken='ANATR'";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionSkipTokenWithOrderByTest() {
		String inp = "SystemQueryOptionSkipTokenWithOrderByTest";
		String uri = "Products?$orderby=SupplierID desc, ProductName&$skiptoken=20,'Gula Malacca',44";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionFilterEqualTest() {
		String inp = "SystemQueryOptionFilterEqualTest";
		String uri = "Suppliers?$filter=Country eq 'Brazil'";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionFilterGreaterThanTest() {
		String inp = "SystemQueryOptionFilterGreaterThanTest";
		String uri = "Products?$top=20&$filter=UnitPrice gt 20";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionFilterGreaterThanOrEqualTest() {
		String inp = "SystemQueryOptionFilterGreaterThanOrEqualTest";
		String uri = "Products?$top=20&$filter=UnitPrice ge 10";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionFilterLessThanTest() {
		String inp = "SystemQueryOptionFilterLessThanTest";
		String uri = "Products?$top=20&$filter=UnitPrice lt 20";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionFilterLessThanOrEqualTest() {
		String inp = "SystemQueryOptionFilterLessThanOrEqualTest";
		String uri = "Products?$top=20&$filter=UnitPrice le 100";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionFilterLogicalAndTest() {
		String inp = "SystemQueryOptionFilterLogicalAndTest";
		String uri = "Products?$top=20&$filter=UnitPrice le 200 and UnitPrice gt 3.5";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionFilterLogicalOrTest() {
		String inp = "SystemQueryOptionFilterLogicalOrTest";
		String uri = "Products?$filter=UnitPrice le 3.5 or UnitPrice gt 200";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionFilterGroupingLogicalAndTest() {
		String inp = "SystemQueryOptionFilterGroupingLogicalAndTest";
		String uri = "Products?$top=10&$filter=(UnitPrice gt 5) and (UnitPrice lt 20)";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionOrderByTop21Test() {
		String inp = "SystemQueryOptionOrderByTop21";
		String uri = "Products?$top=21&$orderby=ProductID";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionExpand1Test() {
		String inp = "SystemQueryOptionExpand1Test";
		String uri = "Categories?$expand=Products";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	// @Test
	// public void SystemQueryOptionExpand2Test() {
	// String inp = "SystemQueryOptionExpand2Test";
	// String uri = "Categories?$expand=Products/Supplier";
	// NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	// }

	@Test
	public void SystemQueryOptionExpand3Test() {
		String inp = "SystemQueryOptionExpand3Test";
		String uri = "Products?$expand=Category,Supplier";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}

	@Test
	public void SystemQueryOptionExpand4Test() {
		String inp = "SystemQueryOptionExpand4Test";
		String uri = "Orders?$top=10&$orderby=OrderID&$expand=OrderDetails/Product";
		NorthwindTestUtils.testAtomResult(endpointUri, uri, inp);
	}
     
}